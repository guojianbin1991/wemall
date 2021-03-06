package com.wemall.foundation.service;

import com.wemall.core.query.support.IPageList;
import com.wemall.core.query.support.IQueryObject;
import com.wemall.foundation.domain.Complaint;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract interface IComplaintService {
    public abstract boolean save(Complaint paramComplaint);

    public abstract Complaint getObjById(Long paramLong);

    public abstract boolean delete(Long paramLong);

    public abstract boolean batchDelete(List<Serializable> paramList);

    public abstract IPageList list(IQueryObject paramIQueryObject);

    public abstract boolean update(Complaint paramComplaint);

    public abstract List<Complaint> query(String paramString, Map paramMap, int paramInt1, int paramInt2);
}




