/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Model.Ejecutivo;
import Persistencia.NewHibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author FrancoSebastian
 */
public class EjecutivoDao implements Operaciones{

     @Override
    public List Listar() {
        Session session = null;
        List<Ejecutivo> ejecutivo = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Ejecutivo");
            ejecutivo = (List<Ejecutivo>) query.list();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return ejecutivo;
    }

    @Override
    public void Insertar(Object value) {
        Session session = null;
        try {
            Ejecutivo ejecutivo = (Ejecutivo) value;
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(ejecutivo);
            session.getTransaction().commit();

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();

            }

        }
    }

    @Override
    public void Actualizar(Object value) {
         Session session = null;
        try {
            Ejecutivo ejecutivo = (Ejecutivo) value;
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(ejecutivo);
            session.getTransaction().commit();

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();

            }

        }
    }

    @Override
    public void Borrar(Object value) {
        Session session = null;
        try {
            Ejecutivo ejecutivo = (Ejecutivo) value;
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(ejecutivo);
            session.getTransaction().commit();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();

            }

        }
    }
    
}
