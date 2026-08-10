
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Changes the order of Assets on a Variant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantChangeAssetOrderAction variantChangeAssetOrderAction = VariantChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeAssetOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantChangeAssetOrderActionImpl.class)
public interface VariantChangeAssetOrderAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantChangeAssetOrderAction
     */
    String CHANGE_ASSET_ORDER = "changeAssetOrder";

    /**
     *  <p>Whether only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     * @return assetOrder
     */
    @NotNull
    @JsonProperty("assetOrder")
    public List<String> getAssetOrder();

    /**
     *  <p>Whether only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     * @param assetOrder values to be set
     */

    @JsonIgnore
    public void setAssetOrder(final String... assetOrder);

    /**
     *  <p>All existing Asset <code>id</code>s of the Variant in the desired new order.</p>
     * @param assetOrder values to be set
     */

    public void setAssetOrder(final List<String> assetOrder);

    /**
     * factory method
     * @return instance of VariantChangeAssetOrderAction
     */
    public static VariantChangeAssetOrderAction of() {
        return new VariantChangeAssetOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantChangeAssetOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantChangeAssetOrderAction of(final VariantChangeAssetOrderAction template) {
        VariantChangeAssetOrderActionImpl instance = new VariantChangeAssetOrderActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetOrder(template.getAssetOrder());
        return instance;
    }

    public VariantChangeAssetOrderAction copyDeep();

    /**
     * factory method to create a deep copy of VariantChangeAssetOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantChangeAssetOrderAction deepCopy(@Nullable final VariantChangeAssetOrderAction template) {
        if (template == null) {
            return null;
        }
        VariantChangeAssetOrderActionImpl instance = new VariantChangeAssetOrderActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetOrder(Optional.ofNullable(template.getAssetOrder()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantChangeAssetOrderAction
     * @return builder
     */
    public static VariantChangeAssetOrderActionBuilder builder() {
        return VariantChangeAssetOrderActionBuilder.of();
    }

    /**
     * create builder for VariantChangeAssetOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantChangeAssetOrderActionBuilder builder(final VariantChangeAssetOrderAction template) {
        return VariantChangeAssetOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantChangeAssetOrderAction(Function<VariantChangeAssetOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantChangeAssetOrderAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantChangeAssetOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantChangeAssetOrderAction>";
            }
        };
    }
}
