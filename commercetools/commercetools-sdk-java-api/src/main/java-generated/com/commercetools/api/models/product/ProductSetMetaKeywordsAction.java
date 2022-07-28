
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
 * ProductSetMetaKeywordsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaKeywordsAction productSetMetaKeywordsAction = ProductSetMetaKeywordsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetMetaKeywordsActionImpl.class)
public interface ProductSetMetaKeywordsAction extends ProductUpdateAction {

    String SET_META_KEYWORDS = "setMetaKeywords";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>If <code>true</code>, only the staged <code>metaKeywords</code> is updated. If <code>false</code>, both the current and staged <code>metaKeywords</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setMetaKeywords(final LocalizedString metaKeywords);

    public void setStaged(final Boolean staged);

    public static ProductSetMetaKeywordsAction of() {
        return new ProductSetMetaKeywordsActionImpl();
    }

    public static ProductSetMetaKeywordsAction of(final ProductSetMetaKeywordsAction template) {
        ProductSetMetaKeywordsActionImpl instance = new ProductSetMetaKeywordsActionImpl();
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetMetaKeywordsActionBuilder builder() {
        return ProductSetMetaKeywordsActionBuilder.of();
    }

    public static ProductSetMetaKeywordsActionBuilder builder(final ProductSetMetaKeywordsAction template) {
        return ProductSetMetaKeywordsActionBuilder.of(template);
    }

    default <T> T withProductSetMetaKeywordsAction(Function<ProductSetMetaKeywordsAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaKeywordsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaKeywordsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetMetaKeywordsAction>";
            }
        };
    }
}
