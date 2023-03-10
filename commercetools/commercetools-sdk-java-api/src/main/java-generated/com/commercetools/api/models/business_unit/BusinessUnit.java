
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generic type to model those fields all Business Units have in common.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnit businessUnit = BusinessUnit.companyBuilder()
 *             id("{id}")
 *             version(0.3)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             key("{key}")
 *             status(BusinessUnitStatus.ACTIVE)
 *             storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             name("{name}")
 *             plusAddresses(addressesBuilder -> addressesBuilder)
 *             plusAssociates(associatesBuilder -> associatesBuilder)
 *             topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.CompanyImpl.class, name = Company.COMPANY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.business_unit.DivisionImpl.class, name = Division.DIVISION) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "unitType", defaultImpl = BusinessUnitImpl.class, visible = true)
@JsonDeserialize(as = BusinessUnitImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnit extends BaseResource, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Business Unit.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier of the Business Unit.</p>
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     */
    @NotNull
    @JsonProperty("status")
    public BusinessUnitStatus getStatus();

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent.</p>
     */
    @NotNull
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
     *  <p>Custom Fields for the Business Unit.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     */

    @JsonProperty("shippingAddressIds")
    public List<String> getShippingAddressIds();

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     */

    @JsonProperty("defaultShippingAddressId")
    public String getDefaultShippingAddressId();

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     */

    @JsonProperty("billingAddressIds")
    public List<String> getBillingAddressIds();

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     */

    @JsonProperty("defaultBillingAddressId")
    public String getDefaultBillingAddressId();

    /**
     *  <p>Members that are part of the Business Unit in specific roles.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("associates")
    public List<Associate> getAssociates();

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     */
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitKeyReference getParentUnit();

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("topLevelUnit")
    public BusinessUnitKeyReference getTopLevelUnit();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setStatus(final BusinessUnitStatus status);

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    public void setStores(final List<StoreKeyReference> stores);

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    public void setName(final String name);

    public void setContactEmail(final String contactEmail);

    public void setCustom(final CustomFields custom);

    @JsonIgnore
    public void setAddresses(final Address... addresses);

    public void setAddresses(final List<Address> addresses);

    @JsonIgnore
    public void setShippingAddressIds(final String... shippingAddressIds);

    public void setShippingAddressIds(final List<String> shippingAddressIds);

    public void setDefaultShippingAddressId(final String defaultShippingAddressId);

    @JsonIgnore
    public void setBillingAddressIds(final String... billingAddressIds);

    public void setBillingAddressIds(final List<String> billingAddressIds);

    public void setDefaultBillingAddressId(final String defaultBillingAddressId);

    @JsonIgnore
    public void setAssociates(final Associate... associates);

    public void setAssociates(final List<Associate> associates);

    public void setParentUnit(final BusinessUnitKeyReference parentUnit);

    public void setTopLevelUnit(final BusinessUnitKeyReference topLevelUnit);

    public static com.commercetools.api.models.business_unit.CompanyBuilder companyBuilder() {
        return com.commercetools.api.models.business_unit.CompanyBuilder.of();
    }

    public static com.commercetools.api.models.business_unit.DivisionBuilder divisionBuilder() {
        return com.commercetools.api.models.business_unit.DivisionBuilder.of();
    }

    default <T> T withBusinessUnit(Function<BusinessUnit, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnit> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnit>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnit>";
            }
        };
    }
}
