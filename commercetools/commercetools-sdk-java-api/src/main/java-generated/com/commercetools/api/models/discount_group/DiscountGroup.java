
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountGroup
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroup discountGroup = DiscountGroup.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .sortOrder("{sortOrder}")
 *             .isActive(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupImpl.class)
public interface DiscountGroup extends BaseResource {

    /**
     *  <p>Unique identifier of the DiscountGroup.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the DiscountGroup.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier of the DiscountGroup.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description of the DiscountGroup.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup is applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>The sort order is unique among all DiscountGroups and CartDiscounts.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @return isActive
     */
    @NotNull
    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>Date and time (UTC) the DiscountGroup was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the DiscountGroup was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the DiscountGroup.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the DiscountGroup.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Unique identifier of the DiscountGroup.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the DiscountGroup.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier of the DiscountGroup.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description of the DiscountGroup.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup is applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>The sort order is unique among all DiscountGroups and CartDiscounts.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     *  <p>Date and time (UTC) the DiscountGroup was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the DiscountGroup was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the DiscountGroup.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the DiscountGroup.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     * factory method
     * @return instance of DiscountGroup
     */
    public static DiscountGroup of() {
        return new DiscountGroupImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroup
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroup of(final DiscountGroup template) {
        DiscountGroupImpl instance = new DiscountGroupImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        return instance;
    }

    public DiscountGroup copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroup
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroup deepCopy(@Nullable final DiscountGroup template) {
        if (template == null) {
            return null;
        }
        DiscountGroupImpl instance = new DiscountGroupImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        return instance;
    }

    /**
     * builder factory method for DiscountGroup
     * @return builder
     */
    public static DiscountGroupBuilder builder() {
        return DiscountGroupBuilder.of();
    }

    /**
     * create builder for DiscountGroup instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupBuilder builder(final DiscountGroup template) {
        return DiscountGroupBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroup(Function<DiscountGroup, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroup> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroup>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroup>";
            }
        };
    }
}
