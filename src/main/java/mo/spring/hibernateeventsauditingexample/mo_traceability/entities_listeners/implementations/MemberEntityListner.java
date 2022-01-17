package mo.spring.hibernateeventsauditingexample.mo_traceability.entities_listeners.implementations;

import mo.spring.hibernateeventsauditingexample.mo_traceability.entities_listeners.IEntityListener;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

public class MemberEntityListner implements IEntityListener {

    public MemberEntityListner() {
    }

    @Override
    @PrePersist
    public void prePersist(Object entity) {
        System.out.println("\n------Member PreInsert Callback------");
        System.out.println(entity.toString());
    }

    @Override
    @PostPersist
    public void postPersist(Object entity) {
        System.out.println("\n------Member PostInsert Callback------");
        System.out.println(entity.toString());
    }

    @Override
    @PreUpdate
    public void preUpdate(Object entity) {
        System.out.println("\n------Member PreUpdate Callback------");
        System.out.println(entity.toString());
    }

    @Override
    @PostUpdate
    public void postUpdate(Object entity) {
        System.out.println("\n------Member PostUpdate Callback------");
        System.out.println(entity.toString());
    }

    @Override
    @PreRemove
    public void preRemove(Object entity) {
        System.out.println("\n------Member PreRemove Callback------");
        System.out.println(entity.toString());
    }

    @Override
    @PostRemove
    public void postRemove(Object entity) {
        System.out.println("\n------Member PostRemove Callback------");
        System.out.println(entity.toString());
    }

    @Override
    @PostLoad
    public void postLoad(Object entity) {
        System.out.println("\n------Member PostLoad Callback------");
        System.out.println(entity.toString());
    }
}
