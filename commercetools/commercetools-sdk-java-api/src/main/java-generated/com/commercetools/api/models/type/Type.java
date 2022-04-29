
package com.commercetools.api.models.type;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TypeImpl.class)
public interface Type extends BaseResource, com.commercetools.api.models.DomainResource<Type>,
        com.commercetools.api.models.Referencable<Type>, com.commercetools.api.models.ResourceIdentifiable<Type> {

    /**
    *  <p>Unique ID of the Type.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>Current version of the Type.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
    *  <p>Date and time (UTC) the Type was initially created.</p>
    */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
    *  <p>Date and time (UTC) the Type was last updated.</p>
    */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/../api/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>User-defined unique identifier for the Type.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>Name of the Type.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
    *  <p>Description of the Type.</p>
    */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
    *  <p>Resources and/or data types for which the Type is defined.</p>
    */
    @NotNull
    @JsonProperty("resourceTypeIds")
    public List<ResourceTypeId> getResourceTypeIds();

    /**
    *  <p>Defines Custom Fields.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("fieldDefinitions")
    public List<FieldDefinition> getFieldDefinitions();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setKey(final String key);

    public void setName(final LocalizedString name);

    public void setDescription(final LocalizedString description);

    @JsonIgnore
    public void setResourceTypeIds(final ResourceTypeId... resourceTypeIds);

    public void setResourceTypeIds(final List<ResourceTypeId> resourceTypeIds);

    @JsonIgnore
    public void setFieldDefinitions(final FieldDefinition... fieldDefinitions);

    public void setFieldDefinitions(final List<FieldDefinition> fieldDefinitions);

    public static Type of() {
        return new TypeImpl();
    }

    public static Type of(final Type template) {
        TypeImpl instance = new TypeImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setResourceTypeIds(template.getResourceTypeIds());
        instance.setFieldDefinitions(template.getFieldDefinitions());
        return instance;
    }

    public static TypeBuilder builder() {
        return TypeBuilder.of();
    }

    public static TypeBuilder builder(final Type template) {
        return TypeBuilder.of(template);
    }

    default <T> T withType(Function<Type, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.type.TypeResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.type.TypeReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Type> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Type>() {
            @Override
            public String toString() {
                return "TypeReference<Type>";
            }
        };
    }
}
