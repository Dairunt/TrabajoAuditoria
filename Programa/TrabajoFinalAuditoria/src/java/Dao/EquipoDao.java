/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Equipo;
import Persistencia.NewHibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.event.spi.EventSource;

/**
 *
 * @author FrancoSebastian
 */
public class EquipoDao implements Operaciones {

    @Override
    public List Listar() {
        Session session = null;
        List<Equipo> equipo = null;
        try {
            session = NewHibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from Equipo");
            equipo = (List<Equipo>) query.list();
        } catch (HibernateException e) {
            System.out.println(e.toString());
        } finally {
            if (session != null) {
                session.close();
            }
        }
        return equipo;
    }

    @Override
    public void Insertar(Object value) {
        Session session = null;
        try {
            Equipo equipo = (Equipo) value;
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(equipo);
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
            Equipo equipo = (Equipo) value;
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(equipo);
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
            Equipo equipo = (Equipo) value;
            session = NewHibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(equipo);
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

}
