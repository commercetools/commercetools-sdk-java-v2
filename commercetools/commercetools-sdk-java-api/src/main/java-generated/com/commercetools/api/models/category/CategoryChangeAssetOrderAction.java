
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action changes the order of the <code>assets</code> array. The new order is defined by listing the <code>id</code>s of the Assets.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeAssetOrderAction categoryChangeAssetOrderAction = CategoryChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeAssetOrderActionImpl.class)
public interface CategoryChangeAssetOrderAction extends CategoryUpdateAction {

    String CHANGE_ASSET_ORDER = "changeAssetOrder";

    /**
     *  <p>New value to set. Must contain all Asset <code>id</code>s.</p>
     */
    @NotNull
    @JsonProperty("assetOrder")
    public List<String> getAssetOrder();

    @JsonIgnore
    public void setAssetOrder(final String... assetOrder);

    public void setAssetOrder(final List<String> assetOrder);

    public static CategoryChangeAssetOrderAction of() {
        return new CategoryChangeAssetOrderActionImpl();
    }

    public static CategoryChangeAssetOrderAction of(final CategoryChangeAssetOrderAction template) {
        CategoryChangeAssetOrderActionImpl instance = new CategoryChangeAssetOrderActionImpl();
        instance.setAssetOrder(template.getAssetOrder());
        return instance;
    }

    public static CategoryChangeAssetOrderActionBuilder builder() {
        return CategoryChangeAssetOrderActionBuilder.of();
    }

    public static CategoryChangeAssetOrderActionBuilder builder(final CategoryChangeAssetOrderAction template) {
        return CategoryChangeAssetOrderActionBuilder.of(template);
    }

    default <T> T withCategoryChangeAssetOrderAction(Function<CategoryChangeAssetOrderAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeAssetOrderAction>";
            }
        };
    }
}
