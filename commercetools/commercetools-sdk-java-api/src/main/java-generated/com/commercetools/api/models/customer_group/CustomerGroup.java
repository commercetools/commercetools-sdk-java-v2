
package com.commercetools.api.models.customer_group;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
public interface CustomerGroup extends BaseResource, com.commercetools.api.models.DomainResource<CustomerGroup>,
        com.commercetools.api.models.Referencable<CustomerGroup>,
        com.commercetools.api.models.ResourceIdentifiable<CustomerGroup>,
        com.commercetools.api.models.Customizable<CustomerGroup> {

    /**
     *  <p>Unique identifier of the CustomerGroup.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the CustomerGroup.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the CustomerGroup was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the CustomerGroup was last updated.</p>
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
     *  <p>User-defined unique identifier for the CustomerGroup.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique name of the CustomerGroup.</p>
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Custom Fields for the CustomerGroup.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setName(final String name);

    public void setCustom(final CustomFields custom);

    public static CustomerGroup of() {
        return new CustomerGroupImpl();
    }

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

    public static CustomerGroupBuilder builder() {
        return CustomerGroupBuilder.of();
    }

    public static CustomerGroupBuilder builder(final CustomerGroup template) {
        return CustomerGroupBuilder.of(template);
    }

    default <T> T withCustomerGroup(Function<CustomerGroup, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier.builder()
                .id(getId())
                .build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.customer_group.CustomerGroupReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroup> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroup>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroup>";
            }
        };
    }
}
