
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Draft type to represent the top level of a business. Contains the fields and values of the generic MyBusinessUnitDraft that are used specifically for creating a Company.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCompanyDraftImpl implements MyCompanyDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private String name;

    private String contactEmail;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    private java.util.List<Integer> shippingAddresses;

    private Integer defaultShippingAddress;

    private java.util.List<Integer> billingAddresses;

    private Integer defaultBillingAddress;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCompanyDraftImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("contactEmail") final String contactEmail,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses,
            @JsonProperty("shippingAddresses") final java.util.List<Integer> shippingAddresses,
            @JsonProperty("defaultShippingAddress") final Integer defaultShippingAddress,
            @JsonProperty("billingAddresses") final java.util.List<Integer> billingAddresses,
            @JsonProperty("defaultBillingAddress") final Integer defaultBillingAddress) {
        this.key = key;
        this.name = name;
        this.contactEmail = contactEmail;
        this.custom = custom;
        this.addresses = addresses;
        this.shippingAddresses = shippingAddresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.billingAddresses = billingAddresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.unitType = BusinessUnitType.findEnum("Company");
    }

    /**
     * create empty instance
     */
    public MyCompanyDraftImpl() {
        this.unitType = BusinessUnitType.findEnum("Company");
    }

    /**
     *  <p>User-defined unique identifier for the BusinessUnit.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Type of the Business Unit indicating its position in a hierarchy.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     */

    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     */

    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     */

    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setContactEmail(final String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setAddresses(final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
    }

    public void setShippingAddresses(final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
    }

    public void setShippingAddresses(final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public void setDefaultShippingAddress(final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
    }

    public void setBillingAddresses(final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
    }

    public void setBillingAddresses(final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public void setDefaultBillingAddress(final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCompanyDraftImpl that = (MyCompanyDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(custom, that.custom)
                .append(addresses, that.addresses)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(key, that.key)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(custom, that.custom)
                .append(addresses, that.addresses)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(unitType)
                .append(name)
                .append(contactEmail)
                .append(custom)
                .append(addresses)
                .append(shippingAddresses)
                .append(defaultShippingAddress)
                .append(billingAddresses)
                .append(defaultBillingAddress)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("unitType", unitType)
                .append("name", name)
                .append("contactEmail", contactEmail)
                .append("custom", custom)
                .append("addresses", addresses)
                .append("shippingAddresses", shippingAddresses)
                .append("defaultShippingAddress", defaultShippingAddress)
                .append("billingAddresses", billingAddresses)
                .append("defaultBillingAddress", defaultBillingAddress)
                .build();
    }

    @Override
    public MyCompanyDraft copyDeep() {
        return MyCompanyDraft.deepCopy(this);
    }
}
