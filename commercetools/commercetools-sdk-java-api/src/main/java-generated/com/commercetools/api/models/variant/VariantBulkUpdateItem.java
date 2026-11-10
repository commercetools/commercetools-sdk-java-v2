
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Identifies a single Variant to be updated in a bulk update request. Provide either <code>id</code> or <code>key</code> to identify the Variant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdateItem variantBulkUpdateItem = VariantBulkUpdateItem.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantBulkUpdateItemImpl.class)
public interface VariantBulkUpdateItem {

    /**
     *  <p>Unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @return id
     */

    @JsonProperty("id")
    public String getId();

    /**
     *  <p>User-defined unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Expected version of the Variant. Required when the <code>versionControl</code> query parameter is <code>On</code> (the default). If the version does not match, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned for that item. Not required when <code>versionControl=Off</code>.</p>
     * @return version
     */

    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>User-defined unique identifier of the Variant to update. Either <code>id</code> or <code>key</code> must be provided.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Expected version of the Variant. Required when the <code>versionControl</code> query parameter is <code>On</code> (the default). If the version does not match, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ConcurrentModificationError" rel="nofollow">ConcurrentModification</a> error is returned for that item. Not required when <code>versionControl=Off</code>.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * factory method
     * @return instance of VariantBulkUpdateItem
     */
    public static VariantBulkUpdateItem of() {
        return new VariantBulkUpdateItemImpl();
    }

    /**
     * factory method to create a shallow copy VariantBulkUpdateItem
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantBulkUpdateItem of(final VariantBulkUpdateItem template) {
        VariantBulkUpdateItemImpl instance = new VariantBulkUpdateItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public VariantBulkUpdateItem copyDeep();

    /**
     * factory method to create a deep copy of VariantBulkUpdateItem
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantBulkUpdateItem deepCopy(@Nullable final VariantBulkUpdateItem template) {
        if (template == null) {
            return null;
        }
        VariantBulkUpdateItemImpl instance = new VariantBulkUpdateItemImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * builder factory method for VariantBulkUpdateItem
     * @return builder
     */
    public static VariantBulkUpdateItemBuilder builder() {
        return VariantBulkUpdateItemBuilder.of();
    }

    /**
     * create builder for VariantBulkUpdateItem instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateItemBuilder builder(final VariantBulkUpdateItem template) {
        return VariantBulkUpdateItemBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantBulkUpdateItem(Function<VariantBulkUpdateItem, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantBulkUpdateItem> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantBulkUpdateItem>() {
            @Override
            public String toString() {
                return "TypeReference<VariantBulkUpdateItem>";
            }
        };
    }
}
