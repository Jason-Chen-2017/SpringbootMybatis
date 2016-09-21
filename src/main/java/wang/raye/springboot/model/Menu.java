package wang.raye.springboot.model;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.code
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.label
     *
     * @mbggenerated
     */
    private String label;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url
     *
     * @mbggenerated
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.disable
     *
     * @mbggenerated
     */
    private Short disable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.items
     *
     * @mbggenerated
     */
    private String items;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.code
     *
     * @return the value of menu.code
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.code
     *
     * @param code the value for menu.code
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.label
     *
     * @return the value of menu.label
     *
     * @mbggenerated
     */
    public String getLabel() {
        return label;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.label
     *
     * @param label the value for menu.label
     *
     * @mbggenerated
     */
    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url
     *
     * @return the value of menu.url
     *
     * @mbggenerated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url
     *
     * @param url the value for menu.url
     *
     * @mbggenerated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.disable
     *
     * @return the value of menu.disable
     *
     * @mbggenerated
     */
    public Short getDisable() {
        return disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.disable
     *
     * @param disable the value for menu.disable
     *
     * @mbggenerated
     */
    public void setDisable(Short disable) {
        this.disable = disable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.items
     *
     * @return the value of menu.items
     *
     * @mbggenerated
     */
    public String getItems() {
        return items;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.items
     *
     * @param items the value for menu.items
     *
     * @mbggenerated
     */
    public void setItems(String items) {
        this.items = items == null ? null : items.trim();
    }
}