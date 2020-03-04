import java.util.Date;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table goods
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Goods {
    /**
     * Database Column Remarks:
     *   主键
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * Database Column Remarks:
     *   商家ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.seller_id
     *
     * @mbg.generated
     */
    private Long sellerId;

    /**
     * Database Column Remarks:
     *   品牌
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.brand_id
     *
     * @mbg.generated
     */
    private Long brandId;

    /**
     * Database Column Remarks:
     *   默认SKU
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.default_item_id
     *
     * @mbg.generated
     */
    private Long defaultItemId;

    /**
     * Database Column Remarks:
     *   商品名称 SPU名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.goods_name
     *
     * @mbg.generated
     */
    private String goodsName;

    /**
     * Database Column Remarks:
     *   副标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.caption
     *
     * @mbg.generated
     */
    private String caption;

    /**
     * Database Column Remarks:
     *   审核状态 0：未审核  1：审核通过   2：审核不通过
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.audit_status
     *
     * @mbg.generated
     */
    private Byte auditStatus;

    /**
     * Database Column Remarks:
     *   是否上架  0：否  1：是
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_marketable
     *
     * @mbg.generated
     */
    private Boolean isMarketable;

    /**
     * Database Column Remarks:
     *   是否砍价  0：否   1：是
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_bargain
     *
     * @mbg.generated
     */
    private Boolean isBargain;

    /**
     * Database Column Remarks:
     *   是否促销  0：否   1：是
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_promotion
     *
     * @mbg.generated
     */
    private Boolean isPromotion;

    private Integer weight;

    private Long category1Id;

    private Long category2Id;

    private Long category3Id;

    private Long storeParentId;

    private Long storeChildId;

    private String smallPic;

    private Integer price;

    /**
     * Database Column Remarks:
     *   分类模板ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.type_template_id
     *
     * @mbg.generated
     */
    private Long typeTemplateId;

    /**
     * Database Column Remarks:
     *   是否启用规格  0：否  1：是
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_enable_spec
     *
     * @mbg.generated
     */
    private Boolean isEnableSpec;

    /**
     * Database Column Remarks:
     *   是否删除  0：否   1：是
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.is_delete
     *
     * @mbg.generated
     */
    private Boolean isDelete;

    /**
     * Database Column Remarks:
     *   更新时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * Database Column Remarks:
     *   创建时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     * Database Column Remarks:
     *   经度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.longitude
     *
     * @mbg.generated
     */
    private Double longitude;

    /**
     * Database Column Remarks:
     *   纬度
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.latitude
     *
     * @mbg.generated
     */
    private Double latitude;

    /**
     * Database Column Remarks:
     *   地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.address
     *
     * @mbg.generated
     */
    private String address;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.seller_id
     *
     * @return the value of goods.seller_id
     *
     * @mbg.generated
     */
    public Long getSellerId() {
        return sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.seller_id
     *
     * @param sellerId the value for goods.seller_id
     *
     * @mbg.generated
     */
    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.brand_id
     *
     * @return the value of goods.brand_id
     *
     * @mbg.generated
     */
    public Long getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.brand_id
     *
     * @param brandId the value for goods.brand_id
     *
     * @mbg.generated
     */
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.default_item_id
     *
     * @return the value of goods.default_item_id
     *
     * @mbg.generated
     */
    public Long getDefaultItemId() {
        return defaultItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.default_item_id
     *
     * @param defaultItemId the value for goods.default_item_id
     *
     * @mbg.generated
     */
    public void setDefaultItemId(Long defaultItemId) {
        this.defaultItemId = defaultItemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.goods_name
     *
     * @return the value of goods.goods_name
     *
     * @mbg.generated
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.goods_name
     *
     * @param goodsName the value for goods.goods_name
     *
     * @mbg.generated
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.caption
     *
     * @return the value of goods.caption
     *
     * @mbg.generated
     */
    public String getCaption() {
        return caption;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.caption
     *
     * @param caption the value for goods.caption
     *
     * @mbg.generated
     */
    public void setCaption(String caption) {
        this.caption = caption == null ? null : caption.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.audit_status
     *
     * @return the value of goods.audit_status
     *
     * @mbg.generated
     */
    public Byte getAuditStatus() {
        return auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.audit_status
     *
     * @param auditStatus the value for goods.audit_status
     *
     * @mbg.generated
     */
    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.is_marketable
     *
     * @return the value of goods.is_marketable
     *
     * @mbg.generated
     */
    public Boolean getIsMarketable() {
        return isMarketable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.is_marketable
     *
     * @param isMarketable the value for goods.is_marketable
     *
     * @mbg.generated
     */
    public void setIsMarketable(Boolean isMarketable) {
        this.isMarketable = isMarketable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.is_bargain
     *
     * @return the value of goods.is_bargain
     *
     * @mbg.generated
     */
    public Boolean getIsBargain() {
        return isBargain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.is_bargain
     *
     * @param isBargain the value for goods.is_bargain
     *
     * @mbg.generated
     */
    public void setIsBargain(Boolean isBargain) {
        this.isBargain = isBargain;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.is_promotion
     *
     * @return the value of goods.is_promotion
     *
     * @mbg.generated
     */
    public Boolean getIsPromotion() {
        return isPromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.is_promotion
     *
     * @param isPromotion the value for goods.is_promotion
     *
     * @mbg.generated
     */
    public void setIsPromotion(Boolean isPromotion) {
        this.isPromotion = isPromotion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.weight
     *
     * @return the value of goods.weight
     *
     * @mbg.generated
     */
    public Integer getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.weight
     *
     * @param weight the value for goods.weight
     *
     * @mbg.generated
     */
    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.category1_id
     *
     * @return the value of goods.category1_id
     *
     * @mbg.generated
     */
    public Long getCategory1Id() {
        return category1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.category1_id
     *
     * @param category1Id the value for goods.category1_id
     *
     * @mbg.generated
     */
    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.category2_id
     *
     * @return the value of goods.category2_id
     *
     * @mbg.generated
     */
    public Long getCategory2Id() {
        return category2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.category2_id
     *
     * @param category2Id the value for goods.category2_id
     *
     * @mbg.generated
     */
    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.category3_id
     *
     * @return the value of goods.category3_id
     *
     * @mbg.generated
     */
    public Long getCategory3Id() {
        return category3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.category3_id
     *
     * @param category3Id the value for goods.category3_id
     *
     * @mbg.generated
     */
    public void setCategory3Id(Long category3Id) {
        this.category3Id = category3Id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.store_parent_id
     *
     * @return the value of goods.store_parent_id
     *
     * @mbg.generated
     */
    public Long getStoreParentId() {
        return storeParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.store_parent_id
     *
     * @param storeParentId the value for goods.store_parent_id
     *
     * @mbg.generated
     */
    public void setStoreParentId(Long storeParentId) {
        this.storeParentId = storeParentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.store_child_id
     *
     * @return the value of goods.store_child_id
     *
     * @mbg.generated
     */
    public Long getStoreChildId() {
        return storeChildId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.store_child_id
     *
     * @param storeChildId the value for goods.store_child_id
     *
     * @mbg.generated
     */
    public void setStoreChildId(Long storeChildId) {
        this.storeChildId = storeChildId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.small_pic
     *
     * @return the value of goods.small_pic
     *
     * @mbg.generated
     */
    public String getSmallPic() {
        return smallPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.small_pic
     *
     * @param smallPic the value for goods.small_pic
     *
     * @mbg.generated
     */
    public void setSmallPic(String smallPic) {
        this.smallPic = smallPic == null ? null : smallPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.price
     *
     * @return the value of goods.price
     *
     * @mbg.generated
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.price
     *
     * @param price the value for goods.price
     *
     * @mbg.generated
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.type_template_id
     *
     * @return the value of goods.type_template_id
     *
     * @mbg.generated
     */
    public Long getTypeTemplateId() {
        return typeTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.type_template_id
     *
     * @param typeTemplateId the value for goods.type_template_id
     *
     * @mbg.generated
     */
    public void setTypeTemplateId(Long typeTemplateId) {
        this.typeTemplateId = typeTemplateId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.is_enable_spec
     *
     * @return the value of goods.is_enable_spec
     *
     * @mbg.generated
     */
    public Boolean getIsEnableSpec() {
        return isEnableSpec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.is_enable_spec
     *
     * @param isEnableSpec the value for goods.is_enable_spec
     *
     * @mbg.generated
     */
    public void setIsEnableSpec(Boolean isEnableSpec) {
        this.isEnableSpec = isEnableSpec;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.is_delete
     *
     * @return the value of goods.is_delete
     *
     * @mbg.generated
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.is_delete
     *
     * @param isDelete the value for goods.is_delete
     *
     * @mbg.generated
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.update_time
     *
     * @return the value of goods.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.update_time
     *
     * @param updateTime the value for goods.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.create_time
     *
     * @return the value of goods.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.create_time
     *
     * @param createTime the value for goods.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.longitude
     *
     * @return the value of goods.longitude
     *
     * @mbg.generated
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.longitude
     *
     * @param longitude the value for goods.longitude
     *
     * @mbg.generated
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.latitude
     *
     * @return the value of goods.latitude
     *
     * @mbg.generated
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.latitude
     *
     * @param latitude the value for goods.latitude
     *
     * @mbg.generated
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.address
     *
     * @return the value of goods.address
     *
     * @mbg.generated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.address
     *
     * @param address the value for goods.address
     *
     * @mbg.generated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}