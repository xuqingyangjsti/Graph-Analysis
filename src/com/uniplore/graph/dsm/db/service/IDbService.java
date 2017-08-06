package com.uniplore.graph.dsm.db.service;

import com.uniplore.graph.dsm.db.entity.DbPO;
import com.uniplore.graph.dsm.db.entity.DbVO;
import com.uniplore.graph.dsm.db.entity.PagingVO;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

public interface IDbService {

  public String connectDataBase(DbPO dbPo)throws Exception;

  public List<String> showDataBase(DbPO dbPo)throws Exception;

  public List<String> showTable(DbPO dbPo,String dbName) throws Exception;

  public List<String> showColumn(DbPO dbPo, String dbName, String tableName)throws Exception;

  public String dbDataFormatJson(DbPO dbPo, DbVO dbVo) throws Exception;

  public String paddingTableInfomation(DbPO dbPo, DbVO dbVo) throws Exception;

  public String increseGetJsonData(DbPO dbPo, DbVO dbVo, PagingVO pagingVo)throws Exception;
}
