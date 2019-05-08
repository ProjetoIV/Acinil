package br.com.acinil.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static SessionFactory FabricadeSessoes = criarFabricadeSessoes();

    /**
     * @return the fabricadeSessoes
     */
    public static SessionFactory getFabricadeSessoes() {
        return FabricadeSessoes;
    }

    public static SessionFactory criarFabricadeSessoes(){
        try{
            Configuration confiracao = new Configuration().configure();

            ServiceRegistry = new StandardServiceRegistryBuilder().applySetting(confiracao, getProperties());
            SessionFactory fabrica = confiracao.buildSessionFactory();
        }
        catch(Throwable ex){
            System.err.println("A Fabrica de Sessões não pode ser criada." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }    
}