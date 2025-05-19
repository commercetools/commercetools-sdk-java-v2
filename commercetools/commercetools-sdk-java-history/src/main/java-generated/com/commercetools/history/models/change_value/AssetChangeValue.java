
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * AssetChangeValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AssetChangeValue assetChangeValue = AssetChangeValue.builder()
 *             .id("{id}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AssetChangeValueImpl.class)
public interface AssetChangeValue {

    /**
     *  <p><code>id</code> of the Asset.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Name of the Asset.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p><code>id</code> of the Asset.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Name of the Asset.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of AssetChangeValue
     */
    public static AssetChangeValue of() {
        return new AssetChangeValueImpl();
    }

    /**
     * factory method to create a shallow copy AssetChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static AssetChangeValue of(final AssetChangeValue template) {
        AssetChangeValueImpl instance = new AssetChangeValueImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        return instance;
    }

    public AssetChangeValue copyDeep();

    /**
     * factory method to create a deep copy of AssetChangeValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AssetChangeValue deepCopy(@Nullable final AssetChangeValue template) {
        if (template == null) {
            return null;
        }
        AssetChangeValueImpl instance = new AssetChangeValueImpl();
        instance.setId(template.getId());
        instance.setName(com.commercetools.history.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for AssetChangeValue
     * @return builder
     */
    public static AssetChangeValueBuilder builder() {
        return AssetChangeValueBuilder.of();
    }

    /**
     * create builder for AssetChangeValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AssetChangeValueBuilder builder(final AssetChangeValue template) {
        return AssetChangeValueBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAssetChangeValue(Function<AssetChangeValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AssetChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AssetChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<AssetChangeValue>";
            }
        };
    }
}
