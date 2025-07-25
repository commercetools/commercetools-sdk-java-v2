
package com.commercetools.importapi.models.discount_codes;

import java.time.*;
import java.util.*;

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
 *  <p>Represents the data used to import a DiscountCode. Once imported, this data is persisted as a DiscountCode in the Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeImportImpl implements DiscountCodeImport, ModelBase {

    private String key;

    private com.commercetools.importapi.models.common.LocalizedString name;

    private com.commercetools.importapi.models.common.LocalizedString description;

    private String code;

    private java.util.List<com.commercetools.importapi.models.common.CartDiscountKeyReference> cartDiscounts;

    private String cartPredicate;

    private Boolean isActive;

    private Long maxApplications;

    private Long maxApplicationsPerCustomer;

    private java.util.List<String> groups;

    private java.time.ZonedDateTime validFrom;

    private java.time.ZonedDateTime validUntil;

    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("name") final com.commercetools.importapi.models.common.LocalizedString name,
            @JsonProperty("description") final com.commercetools.importapi.models.common.LocalizedString description,
            @JsonProperty("code") final String code,
            @JsonProperty("cartDiscounts") final java.util.List<com.commercetools.importapi.models.common.CartDiscountKeyReference> cartDiscounts,
            @JsonProperty("cartPredicate") final String cartPredicate, @JsonProperty("isActive") final Boolean isActive,
            @JsonProperty("maxApplications") final Long maxApplications,
            @JsonProperty("maxApplicationsPerCustomer") final Long maxApplicationsPerCustomer,
            @JsonProperty("groups") final java.util.List<String> groups,
            @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom,
            @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.key = key;
        this.name = name;
        this.description = description;
        this.code = code;
        this.cartDiscounts = cartDiscounts;
        this.cartPredicate = cartPredicate;
        this.isActive = isActive;
        this.maxApplications = maxApplications;
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
        this.groups = groups;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public DiscountCodeImportImpl() {
    }

    /**
     *  <p>User-defined unique identifier. If a DiscountCode with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Maps to <code>DiscountCode.name</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Maps to <code>DiscountCode.description</code>.</p>
     */

    public com.commercetools.importapi.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Maps to <code>DiscountCode.code</code>. This value cannot be updated. Attempting to update this value will result in an InvalidFieldsUpdate error.</p>
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartDiscounts</code>. If the referenced CartDiscounts do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the referenced CartDiscounts are created.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.CartDiscountKeyReference> getCartDiscounts() {
        return this.cartDiscounts;
    }

    /**
     *  <p>Maps to <code>DiscountCode.cartPredicate</code>.</p>
     */

    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
     *  <p>Maps to <code>DiscountCode.isActive</code>.</p>
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>Maps to <code>DiscountCode.maxApplications</code>.</p>
     */

    public Long getMaxApplications() {
        return this.maxApplications;
    }

    /**
     *  <p>Maps to <code>DiscountCode.maxApplicationsPerCustomer</code>.</p>
     */

    public Long getMaxApplicationsPerCustomer() {
        return this.maxApplicationsPerCustomer;
    }

    /**
     *  <p>Maps to <code>DiscountCode.groups</code>.</p>
     */

    public java.util.List<String> getGroups() {
        return this.groups;
    }

    /**
     *  <p>Maps to <code>DiscountCode.validFrom</code>.</p>
     */

    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Maps to <code>DiscountCode.validUntil</code>.</p>
     */

    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Maps to <code>DiscountCode.custom</code>.</p>
     */

    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final com.commercetools.importapi.models.common.LocalizedString name) {
        this.name = name;
    }

    public void setDescription(final com.commercetools.importapi.models.common.LocalizedString description) {
        this.description = description;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    public void setCartDiscounts(
            final com.commercetools.importapi.models.common.CartDiscountKeyReference... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
    }

    public void setCartDiscounts(
            final java.util.List<com.commercetools.importapi.models.common.CartDiscountKeyReference> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
    }

    public void setCartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
    }

    public void setIsActive(final Boolean isActive) {
        this.isActive = isActive;
    }

    public void setMaxApplications(final Long maxApplications) {
        this.maxApplications = maxApplications;
    }

    public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer) {
        this.maxApplicationsPerCustomer = maxApplicationsPerCustomer;
    }

    public void setGroups(final String... groups) {
        this.groups = new ArrayList<>(Arrays.asList(groups));
    }

    public void setGroups(final java.util.List<String> groups) {
        this.groups = groups;
    }

    public void setValidFrom(final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeImportImpl that = (DiscountCodeImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(code, that.code)
                .append(cartDiscounts, that.cartDiscounts)
                .append(cartPredicate, that.cartPredicate)
                .append(isActive, that.isActive)
                .append(maxApplications, that.maxApplications)
                .append(maxApplicationsPerCustomer, that.maxApplicationsPerCustomer)
                .append(groups, that.groups)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(name, that.name)
                .append(description, that.description)
                .append(code, that.code)
                .append(cartDiscounts, that.cartDiscounts)
                .append(cartPredicate, that.cartPredicate)
                .append(isActive, that.isActive)
                .append(maxApplications, that.maxApplications)
                .append(maxApplicationsPerCustomer, that.maxApplicationsPerCustomer)
                .append(groups, that.groups)
                .append(validFrom, that.validFrom)
                .append(validUntil, that.validUntil)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(name)
                .append(description)
                .append(code)
                .append(cartDiscounts)
                .append(cartPredicate)
                .append(isActive)
                .append(maxApplications)
                .append(maxApplicationsPerCustomer)
                .append(groups)
                .append(validFrom)
                .append(validUntil)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("name", name)
                .append("description", description)
                .append("code", code)
                .append("cartDiscounts", cartDiscounts)
                .append("cartPredicate", cartPredicate)
                .append("isActive", isActive)
                .append("maxApplications", maxApplications)
                .append("maxApplicationsPerCustomer", maxApplicationsPerCustomer)
                .append("groups", groups)
                .append("validFrom", validFrom)
                .append("validUntil", validUntil)
                .append("custom", custom)
                .build();
    }

    @Override
    public DiscountCodeImport copyDeep() {
        return DiscountCodeImport.deepCopy(this);
    }
}
