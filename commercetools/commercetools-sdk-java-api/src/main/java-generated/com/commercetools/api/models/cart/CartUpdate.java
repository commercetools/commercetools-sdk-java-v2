
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartUpdate
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUpdate cartUpdate = CartUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUpdateImpl.class)
public interface CartUpdate
        extends com.commercetools.api.models.ResourceUpdate<CartUpdate, CartUpdateAction, CartUpdateBuilder> {

    /**
     *  <p>Expected version of the Cart on which the changes apply. If the expected version does not match the actual version, a 409 Conflict is returned.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Update actions to be performed on the Cart.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<CartUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final CartUpdateAction... actions);

    public void setActions(final List<CartUpdateAction> actions);

    public static CartUpdate of() {
        return new CartUpdateImpl();
    }

    public static CartUpdate of(final CartUpdate template) {
        CartUpdateImpl instance = new CartUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static CartUpdateBuilder builder() {
        return CartUpdateBuilder.of();
    }

    public static CartUpdateBuilder builder(final CartUpdate template) {
        return CartUpdateBuilder.of(template);
    }

    default <T> T withCartUpdate(Function<CartUpdate, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartUpdate> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUpdate>() {
            @Override
            public String toString() {
                return "TypeReference<CartUpdate>";
            }
        };
    }
}
