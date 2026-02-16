
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CustomerGroup
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroup customerGroup = CustomerGroup.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupImpl.class)
public interface CustomerGroup
        extends BaseResource, CustomerGroupMixin, com.commercetools.api.models.DomainResource<CustomerGroup>,
        com.commercetools.api.models.Referencable<CustomerGroup>,
        com.commercetools.api.models.ResourceIdentifiable<CustomerGroup>,
        com.commercetools.api.models.Customizable<CustomerGroup>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the CustomerGroup.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the CustomerGroup.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the CustomerGroup was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the CustomerGroup was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the CustomerGroup.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the CustomerGroup.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique name of the CustomerGroup.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Custom Fields of the CustomerGroup.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Unique identifier of the CustomerGroup.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the CustomerGroup.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the CustomerGroup was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the CustomerGroup was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the CustomerGroup.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the CustomerGroup.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Unique name of the CustomerGroup.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Custom Fields of the CustomerGroup.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     * factory method
     * @return instance of CustomerGroup
     */
    public static CustomerGroup of() {
        return new CustomerGroupImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroup
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroup of(final CustomerGroup template) {
        CustomerGroupImpl instance = new CustomerGroupImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public CustomerGroup copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroup
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroup deepCopy(@Nullable final CustomerGroup template) {
        if (template == null) {
            return null;
        }
        CustomerGroupImpl instance = new CustomerGroupImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for CustomerGroup
     * @return builder
     */
    public static CustomerGroupBuilder builder() {
        return CustomerGroupBuilder.of();
    }

    /**
     * create builder for CustomerGroup instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupBuilder builder(final CustomerGroup template) {
        return CustomerGroupBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroup(Function<CustomerGroup, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.CUSTOMER_GROUP;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroup> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroup>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroup>";
            }
        };
    }
}
