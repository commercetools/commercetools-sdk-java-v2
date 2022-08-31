
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
 * ProductSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDescriptionAction productSetDescriptionAction = ProductSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetDescriptionActionImpl.class)
public interface ProductSetDescriptionAction extends ProductUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setDescription(final LocalizedString description);

    public void setStaged(final Boolean staged);

    public static ProductSetDescriptionAction of() {
        return new ProductSetDescriptionActionImpl();
    }

    public static ProductSetDescriptionAction of(final ProductSetDescriptionAction template) {
        ProductSetDescriptionActionImpl instance = new ProductSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductSetDescriptionActionBuilder builder() {
        return ProductSetDescriptionActionBuilder.of();
    }

    public static ProductSetDescriptionActionBuilder builder(final ProductSetDescriptionAction template) {
        return ProductSetDescriptionActionBuilder.of(template);
    }

    default <T> T withProductSetDescriptionAction(Function<ProductSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetDescriptionAction>";
            }
        };
    }
}
