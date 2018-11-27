package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import java.util.List;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationRevisionedDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.module.jpa.dataaccess.api.MasterDataDao;

/**
 * @author RKULINSK
 *
 */
public interface SpecialDao extends MasterDataDao<SpecialEntity>, ApplicationRevisionedDao<SpecialEntity> {

  /**
   * @param criteria
   * @return
   */
  List<SpecialEntity> getAllSpecialOffers(SpecialSearchCriteriaTo criteria);
}
