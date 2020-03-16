package com.Cooper.grocerylist.models.data;


import com.Cooper.grocerylist.Category;
import com.mysql.cj.util.StringUtils;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DropdownRepositoryImpl extends HibernateDaoSupport implements
        CategoryDropDownRepository {

    @Autowired(required=true)
    public DropdownRepositoryImpl(SessionFactory sessionFactory) {
        super.setSessionFactory(sessionFactory);
    }

    public List<Category> getOptions(String entityName, String nameProp,
                                     String valueProp, String filter) {
        String where = StringUtils.isNullOrEmpty(filter) ? "" : " " + filter;
        final String hql =  "SELECT new com.rlee.myapp.domain.DropdownOption(" + nameProp + "," + valueProp  + ") FROM " + entityName + where;
        List<Category> options = getHibernateTemplate().find(hql);
        return options;
    }
}