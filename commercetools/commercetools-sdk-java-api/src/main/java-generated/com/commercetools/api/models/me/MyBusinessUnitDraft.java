
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
public interface MyBusinessUnitDraft {

    /**
     *  <p>User-defined unique identifier for the BusinessUnit.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

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
     *  <p>Custom Fields for the Business Unit.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

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

    public void setKey(final String key);

    public void setName(final String name);

    public void setContactEmail(final String contactEmail);

    public void setCustom(final CustomFields custom);

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

    public static com.commercetools.api.models.me.MyCompanyDraftBuilder companyBuilder() {
        return com.commercetools.api.models.me.MyCompanyDraftBuilder.of();
    }

    public static com.commercetools.api.models.me.MyDivisionDraftBuilder divisionBuilder() {
        return com.commercetools.api.models.me.MyDivisionDraftBuilder.of();
    }

    default <T> T withMyBusinessUnitDraft(Function<MyBusinessUnitDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyBusinessUnitDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyBusinessUnitDraft>";
            }
        };
    }
}
