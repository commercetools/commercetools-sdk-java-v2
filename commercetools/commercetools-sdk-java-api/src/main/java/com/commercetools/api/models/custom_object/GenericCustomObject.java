
package com.commercetools.api.models.custom_object;

import java.time.ZonedDateTime;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * entity to implement a type safe generic custom object
 * @param <TValue> The type of the value of this custom object.
 */
@JsonDeserialize(as = GenericCustomObjectImpl.class)
public interface GenericCustomObject<TValue>
        extends BaseResource, com.commercetools.api.models.DomainResource<GenericCustomObject<TValue>>,
        Referencable<GenericCustomObject<TValue>> {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    * @return LastModifiedBy
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
     * @return CreatedBy
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>A namespace to group custom objects.</p>
     * @return container name
     */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    @NotNull
    @JsonProperty("value")
    public TValue getValue();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setContainer(final String container);

    public void setKey(final String key);

    public void setValue(final TValue value);

    public static <T> GenericCustomObject<T> of() {
        return new GenericCustomObjectImpl<>();
    }

    public static <T> GenericCustomObject<T> of(final GenericCustomObject<T> template) {
        GenericCustomObjectImpl<T> instance = new GenericCustomObjectImpl<>();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        return instance;
    }

    public static <T> GenericCustomObjectBuilder<T> builder(T value) {
        return GenericCustomObjectBuilder.of(value);
    }

    public static <T> GenericCustomObjectBuilder<T> builder(final GenericCustomObject<T> template) {
        return GenericCustomObjectBuilder.of(template);
    }

    default <T> T withCustomObject(Function<GenericCustomObject<TValue>, T> helper) {
        return helper.apply(this);
    }

    @Override
    default Reference toReference() {
        return CustomObjectReference.builder().id(getId()).build();
    }

    /**
    * factory method to create a deep copy of CustomObject
    * @param template instance to be copied
    * @return copy instance
    */
    @Nullable
    public static <TValue> GenericCustomObject<TValue> deepCopy(@Nullable final GenericCustomObject<TValue> template) {
        if (template == null) {
            return null;
        }
        GenericCustomObjectImpl<TValue> instance = new GenericCustomObjectImpl<>();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        return instance;
    }
}
