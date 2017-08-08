import mappings.ClientsEntity;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Created by tiranid on 08.08.2017.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            ourSessionFactory = new Configuration().
                    configure("hibernate.cfg.xml").
                    buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            /*
            System.out.println("querying all the managed entities...");
            final Map metadataMap = session.getSessionFactory().getAllClassMetadata();
            for (Object key : metadataMap.keySet()) {
                final ClassMetadata classMetadata = (ClassMetadata) metadataMap.get(key);
                final String entityName = classMetadata.getEntityName();
                final Query query = session.createQuery("from " + entityName);
                System.out.println("executing: " + query.getQueryString());
                for (Object o : query.list()) {
                    System.out.println("  " + o);
                }
            }
            */

            Transaction tx = session.beginTransaction();
            ClientsEntity client = new ClientsEntity();
            String clientPass = "qwerty";
            client.setLogin("borushka");
            client.setHash(Integer.toBinaryString(clientPass.hashCode()));
            session.save(client);
            tx.commit();

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            session.close();
        }
    }
}
