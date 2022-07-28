
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Removes the current projection of the Product. The staged projection is unaffected. Unpublished Products only appear in query/search results with <code>staged=false</code>. Produces the ProductUnpublishedMessage.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUnpublishAction productUnpublishAction = ProductUnpublishAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductUnpublishActionImpl.class)
public interface ProductUnpublishAction extends ProductUpdateAction {

    String UNPUBLISH = "unpublish";

    public static ProductUnpublishAction of() {
        return new ProductUnpublishActionImpl();
    }

    public static ProductUnpublishAction of(final ProductUnpublishAction template) {
        ProductUnpublishActionImpl instance = new ProductUnpublishActionImpl();
        return instance;
    }

    public static ProductUnpublishActionBuilder builder() {
        return ProductUnpublishActionBuilder.of();
    }

    public static ProductUnpublishActionBuilder builder(final ProductUnpublishAction template) {
        return ProductUnpublishActionBuilder.of(template);
    }

    default <T> T withProductUnpublishAction(Function<ProductUnpublishAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUnpublishAction>";
            }
        };
    }
}
