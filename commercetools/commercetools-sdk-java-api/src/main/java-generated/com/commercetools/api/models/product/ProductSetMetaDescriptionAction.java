
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetMetaDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaDescriptionAction productSetMetaDescriptionAction = ProductSetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetMetaDescriptionActionImpl.class)
public interface ProductSetMetaDescriptionAction extends ProductUpdateAction {

    String SET_META_DESCRIPTION = "setMetaDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>If <code>true</code>, only the staged <code>metaDescription</code> is updated. If <code>false</code>, both the current and staged <code>metaDescription</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setMetaDescription(final LocalizedString metaDescription);

    public void setStaged(final Boolean staged);

    public static ProductSetMetaDescriptionAction of() {
        return new ProductSetMetaDescriptionActionImpl();
    }

    public static ProductSetMetaDescriptionAction of(final ProductSetMetaDescriptionAction template) {
        ProductSetMetaDescriptionActionImpl instance = new ProductSetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetMetaDescriptionActionBuilder builder() {
        return ProductSetMetaDescriptionActionBuilder.of();
    }

    public static ProductSetMetaDescriptionActionBuilder builder(final ProductSetMetaDescriptionAction template) {
        return ProductSetMetaDescriptionActionBuilder.of(template);
    }

    default <T> T withProductSetMetaDescriptionAction(Function<ProductSetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetMetaDescriptionAction>";
            }
        };
    }
}
