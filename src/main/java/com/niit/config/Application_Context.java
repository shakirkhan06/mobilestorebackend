package com.niit.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.dao.CategoryDao;
import com.niit.dao.SupplierDao;
import com.niit.daoimpl.CategoryDaoImpl;
import com.niit.daoimpl.SupplierDaoImpl;

@Configuration
@ComponentScan("com.niit.mobilestorebackend")
@EnableTransactionManagement
public class Application_Context {

    @Autowired
    @Bean(name = "dataSource")
    public DataSource getH2DataSource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
            
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test1");

        dataSource.setDriverClassName("org.h2.Driver");

        dataSource.setUsername("sa");
        dataSource.setPassword("");
        
        
        return dataSource;
    }
    
   private Properties getHibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.show_sql", "true");
        properties.put("hibernate.hbm2ddl.auto", "update");
        properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
        properties.put("hibernate.format_sql", "true");
        return properties;
    }
   @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {

        LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
        sessionBuilder.addProperties(getHibernateProperties());
        sessionBuilder.scanPackages("com.niit.model");
        return sessionBuilder.buildSessionFactory();
    }

    @Autowired
    @Bean(name = "transactionManager")
    public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);

        return transactionManager;
    }

    
    
   @Autowired
    @Bean(name = "categoryDAO")
    public CategoryDao getCategoryDAO(SessionFactory sessionFactory) {
        return new CategoryDaoImpl(sessionFactory);
    }
   @Autowired
    @Bean(name = "supplierDAO")
    public SupplierDao getSupplierDAO(SessionFactory sessionFactory) {
        return new SupplierDaoImpl(sessionFactory);
    }
 /*  @Autowired
   @Bean(name = "productsDAO")
   public SupplierDao getSupplierDAO(SessionFactory sessionFactory) {
       return new SupplierDaoImpl(sessionFactory);
   }*/
}
   