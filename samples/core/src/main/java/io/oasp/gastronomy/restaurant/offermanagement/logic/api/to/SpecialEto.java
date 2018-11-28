package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;

/**
 * @author RKULINSK
 *
 */
public class SpecialEto extends ApplicationPersistenceEntity implements Special {

  private static final long serialVersionUID = 1L;

  private String name;

  private long offerId;

  private long startingDay;

  private long startingHour;

  private long endingDate;

  private long endingHour;

  private Money specialPrice;

  /**
   * The constructor.
   */
  public SpecialEto() {

    super();
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getname}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return offerId
   */
  public long getOfferId() {

    return this.offerId;
  }

  /**
   * @param offerId new value of {@link #getofferId}.
   */
  public void setOfferId(long offerId) {

    this.offerId = offerId;
  }

  /**
   * @return startingDay
   */
  public long getStartingDay() {

    return this.startingDay;
  }

  /**
   * @param startingDay new value of {@link #getstartingDay}.
   */
  public void setStartingDay(long startingDay) {

    this.startingDay = startingDay;
  }

  /**
   * @return startingHour
   */
  public long getStartingHour() {

    return this.startingHour;
  }

  /**
   * @param startingHour new value of {@link #getstartingHour}.
   */
  public void setStartingHour(long startingHour) {

    this.startingHour = startingHour;
  }

  /**
   * @return endingDate
   */
  public long getEndingDate() {

    return this.endingDate;
  }

  /**
   * @param endingDate new value of {@link #getendingDate}.
   */
  public void setEndingDate(long endingDate) {

    this.endingDate = endingDate;
  }

  /**
   * @return endingHour
   */
  public long getEndingHour() {

    return this.endingHour;
  }

  /**
   * @param endingHour new value of {@link #getendingHour}.
   */
  public void setEndingHour(long endingHour) {

    this.endingHour = endingHour;
  }

  /**
   * @return specialPrice
   */
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  /**
   * @param specialPrice new value of {@link #getspecialPrice}.
   */
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

}
