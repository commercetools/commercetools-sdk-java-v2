
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
 * ProductSetMetaTitleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaTitleAction productSetMetaTitleAction = ProductSetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetMetaTitleActionImpl.class)
public interface ProductSetMetaTitleAction extends ProductUpdateAction {

    String SET_META_TITLE = "setMetaTitle";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>If <code>true</code>, only the staged <code>metaTitle</code> is updated. If <code>false</code>, both the current and staged <code>metaTitle</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setMetaTitle(final LocalizedString metaTitle);

    public void setStaged(final Boolean staged);

    public static ProductSetMetaTitleAction of() {
        return new ProductSetMetaTitleActionImpl();
    }

    public static ProductSetMetaTitleAction of(final ProductSetMetaTitleAction template) {
        ProductSetMetaTitleActionImpl instance = new ProductSetMetaTitleActionImpl();
        instance.setMetaTitle(template.getMetaTitle());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetMetaTitleActionBuilder builder() {
        return ProductSetMetaTitleActionBuilder.of();
    }

    public static ProductSetMetaTitleActionBuilder builder(final ProductSetMetaTitleAction template) {
        return ProductSetMetaTitleActionBuilder.of(template);
    }

    default <T> T withProductSetMetaTitleAction(Function<ProductSetMetaTitleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetMetaTitleAction>";
            }
        };
    }
}
