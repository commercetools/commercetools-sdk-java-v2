
package com.commercetools.api.models.discount_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * DiscountGroupDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountGroupDraft discountGroupDraft = DiscountGroupDraft.builder()
 *             .key("{key}")
 *             .sortOrder("{sortOrder}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountGroupDraftImpl.class)
public interface DiscountGroupDraft extends io.vrap.rmf.base.client.Draft<DiscountGroupDraft> {

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>User-defined unique identifier for the DiscountGroup.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Description for the DiscountGroup.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @return sortOrder
     */
    @NotNull
    @JsonProperty("sortOrder")
    public String getSortOrder();

    /**
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @return isActive
     */

    @JsonProperty("isActive")
    public Boolean getIsActive();

    /**
     *  <p>Name of the DiscountGroup.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>User-defined unique identifier for the DiscountGroup.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Description for the DiscountGroup.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscount from the DiscountGroup will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>The sort order must be unique among all DiscountGroups and CartDiscounts.</p>
     * @param sortOrder value to be set
     */

    public void setSortOrder(final String sortOrder);

    /**
     *  <p>A DiscountGroup must be active for its CartDiscounts to be considered during discount application.</p>
     * @param isActive value to be set
     */

    public void setIsActive(final Boolean isActive);

    /**
     * factory method
     * @return instance of DiscountGroupDraft
     */
    public static DiscountGroupDraft of() {
        return new DiscountGroupDraftImpl();
    }

    /**
     * factory method to create a shallow copy DiscountGroupDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountGroupDraft of(final DiscountGroupDraft template) {
        DiscountGroupDraftImpl instance = new DiscountGroupDraftImpl();
        instance.setName(template.getName());
        instance.setKey(template.getKey());
        instance.setDescription(template.getDescription());
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    public DiscountGroupDraft copyDeep();

    /**
     * factory method to create a deep copy of DiscountGroupDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountGroupDraft deepCopy(@Nullable final DiscountGroupDraft template) {
        if (template == null) {
            return null;
        }
        DiscountGroupDraftImpl instance = new DiscountGroupDraftImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setKey(template.getKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setSortOrder(template.getSortOrder());
        instance.setIsActive(template.getIsActive());
        return instance;
    }

    /**
     * builder factory method for DiscountGroupDraft
     * @return builder
     */
    public static DiscountGroupDraftBuilder builder() {
        return DiscountGroupDraftBuilder.of();
    }

    /**
     * create builder for DiscountGroupDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountGroupDraftBuilder builder(final DiscountGroupDraft template) {
        return DiscountGroupDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountGroupDraft(Function<DiscountGroupDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountGroupDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountGroupDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountGroupDraft>";
            }
        };
    }
}
