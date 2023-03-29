
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitDraft
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitDraft myBusinessUnitDraft = MyBusinessUnitDraft.companyBuilder()
 *             key("{key}")
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyCompanyDraftImpl.class, name = MyCompanyDraft.COMPANY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.me.MyDivisionDraftImpl.class, name = MyDivisionDraft.DIVISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "unitType", defaultImpl = MyBusinessUnitDraftImpl.class, visible = true)
@JsonDeserialize(as = MyBusinessUnitDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MyBusinessUnitDraft
        extends com.commercetools.api.models.Customizable<MyBusinessUnitDraft>, com.commercetools.api.models.WithKey {

    /**
     *  <p>User-defined unique identifier for the BusinessUnit.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Type of the Business Unit indicating its position in a hierarchy.</p>
     * @return unitType
     */
    @NotNull
    @JsonProperty("unitType")
    public BusinessUnitType getUnitType();

    /**
     *  <p>Name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Email address of the Business Unit.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @return addresses
     */
    @Valid
    @JsonProperty("addresses")
    public List<BaseAddress> getAddresses();

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @return shippingAddresses
     */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @return defaultShippingAddress
     */

    @JsonProperty("defaultShippingAddress")
    public Integer getDefaultShippingAddress();

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @return billingAddresses
     */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @return defaultBillingAddress
     */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
     *  <p>User-defined unique identifier for the BusinessUnit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Email address of the Business Unit.</p>
     * @param contactEmail value to be set
     */

    public void setContactEmail(final String contactEmail);

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses values to be set
     */

    @JsonIgnore
    public void setAddresses(final BaseAddress... addresses);

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses values to be set
     */

    public void setAddresses(final List<BaseAddress> addresses);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param shippingAddresses values to be set
     */

    @JsonIgnore
    public void setShippingAddresses(final Integer... shippingAddresses);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param shippingAddresses values to be set
     */

    public void setShippingAddresses(final List<Integer> shippingAddresses);

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @param defaultShippingAddress value to be set
     */

    public void setDefaultShippingAddress(final Integer defaultShippingAddress);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param billingAddresses values to be set
     */

    @JsonIgnore
    public void setBillingAddresses(final Integer... billingAddresses);

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     * @param billingAddresses values to be set
     */

    public void setBillingAddresses(final List<Integer> billingAddresses);

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @param defaultBillingAddress value to be set
     */

    public void setDefaultBillingAddress(final Integer defaultBillingAddress);

    /**
     * factory method to create a deep copy of MyBusinessUnitDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyBusinessUnitDraft deepCopy(@Nullable final MyBusinessUnitDraft template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.me.MyCompanyDraft) {
            return com.commercetools.api.models.me.MyCompanyDraft
                    .deepCopy((com.commercetools.api.models.me.MyCompanyDraft) template);
        }
        if (template instanceof com.commercetools.api.models.me.MyDivisionDraft) {
            return com.commercetools.api.models.me.MyDivisionDraft
                    .deepCopy((com.commercetools.api.models.me.MyDivisionDraft) template);
        }
        MyBusinessUnitDraftImpl instance = new MyBusinessUnitDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingAddresses(
            Optional.ofNullable(template.getShippingAddresses()).map(ArrayList::new).orElse(null));
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setBillingAddresses(
            Optional.ofNullable(template.getBillingAddresses()).map(ArrayList::new).orElse(null));
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        return instance;
    }

    /**
     * builder for company subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyCompanyDraftBuilder companyBuilder() {
        return com.commercetools.api.models.me.MyCompanyDraftBuilder.of();
    }

    /**
     * builder for division subtype
     * @return builder
     */
    public static com.commercetools.api.models.me.MyDivisionDraftBuilder divisionBuilder() {
        return com.commercetools.api.models.me.MyDivisionDraftBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyBusinessUnitDraft(Function<MyBusinessUnitDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitDraft>";
            }
        };
    }
}
