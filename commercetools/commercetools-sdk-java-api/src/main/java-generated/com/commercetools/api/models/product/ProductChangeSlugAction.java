
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the ProductSlugChangedMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeSlugAction productChangeSlugAction = ProductChangeSlugAction.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeSlugActionImpl.class)
public interface ProductChangeSlugAction extends ProductUpdateAction {

    String CHANGE_SLUG = "changeSlug";

    /**
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    public void setSlug(final LocalizedString slug);

    public void setStaged(final Boolean staged);

    public static ProductChangeSlugAction of() {
        return new ProductChangeSlugActionImpl();
    }

    public static ProductChangeSlugAction of(final ProductChangeSlugAction template) {
        ProductChangeSlugActionImpl instance = new ProductChangeSlugActionImpl();
        instance.setSlug(template.getSlug());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductChangeSlugActionBuilder builder() {
        return ProductChangeSlugActionBuilder.of();
    }

    public static ProductChangeSlugActionBuilder builder(final ProductChangeSlugAction template) {
        return ProductChangeSlugActionBuilder.of(template);
    }

    default <T> T withProductChangeSlugAction(Function<ProductChangeSlugAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeSlugAction>";
            }
        };
    }
}
