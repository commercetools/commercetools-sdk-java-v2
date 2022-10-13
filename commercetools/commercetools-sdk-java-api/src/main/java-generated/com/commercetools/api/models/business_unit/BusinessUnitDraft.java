
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generic draft type to model those fields all Business Units have in common.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDraft businessUnitDraft = BusinessUnitDraft.companyBuilder()
 *             key("{key}")
 *             name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.CompanyDraftImpl.class, name = CompanyDraft.COMPANY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.DivisionDraftImpl.class, name = DivisionDraft.DIVISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "unitType", defaultImpl = BusinessUnitDraftImpl.class, visible = true)
@JsonDeserialize(as = BusinessUnitDraftImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitDraft {

    /**
     *  <p>User-defined unique identifier for the Business Unit.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     */

    @JsonProperty("status")
    public BusinessUnitStatus getStatus();

    /**
     *  <p>References to Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. If not empty, the Business Unit can only be linked to Carts and Orders of a referenced Store. If empty, the Business Unit can only create Carts, Orders, or Quotes that have no <code>store</code> value. Defaults to empty for Companies and not set for Divisions.</p>
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Defines whether the Stores of the Business Unit are set on the Business Unit or are inherited from a parent. Defaults to <code>Explicit</code> for Companies and to <code>FromParent</code> for Divisions.</p>
     */

    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     *  <p>Type of the Business Unit indicating its position in a hierarchy.</p>
     */
    @NotNull
    @JsonProperty("unitType")
    public BusinessUnitType getUnitType();

    /**
     *  <p>Name of the Business Unit.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Email address of the Business Unit.</p>
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */
    @Valid
    @JsonProperty("associates")
    public List<AssociateDraft> getAssociates();

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */
    @Valid
    @JsonProperty("addresses")
    public List<BaseAddress> getAddresses();

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     */

    @JsonProperty("defaultShipingAddress")
    public Integer getDefaultShipingAddress();

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    public void setKey(final String key);

    public void setStatus(final BusinessUnitStatus status);

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    public void setStores(final List<StoreKeyReference> stores);

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    public void setName(final String name);

    public void setContactEmail(final String contactEmail);

    @JsonIgnore
    public void setAssociates(final AssociateDraft... associates);

    public void setAssociates(final List<AssociateDraft> associates);

    @JsonIgnore
    public void setAddresses(final BaseAddress... addresses);

    public void setAddresses(final List<BaseAddress> addresses);

    @JsonIgnore
    public void setShippingAddresses(final Integer... shippingAddresses);

    public void setShippingAddresses(final List<Integer> shippingAddresses);

    public void setDefaultShipingAddress(final Integer defaultShipingAddress);

    @JsonIgnore
    public void setBillingAddresses(final Integer... billingAddresses);

    public void setBillingAddresses(final List<Integer> billingAddresses);

    public void setDefaultBillingAddress(final Integer defaultBillingAddress);

    public void setCustom(final CustomFieldsDraft custom);

    public static com.commercetools.api.models.business_unit.CompanyDraftBuilder companyBuilder() {
        return com.commercetools.api.models.business_unit.CompanyDraftBuilder.of();
    }

    public static com.commercetools.api.models.business_unit.DivisionDraftBuilder divisionBuilder() {
        return com.commercetools.api.models.business_unit.DivisionDraftBuilder.of();
    }

    default <T> T withBusinessUnitDraft(Function<BusinessUnitDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitDraft>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitDraft>";
            }
        };
    }
}
