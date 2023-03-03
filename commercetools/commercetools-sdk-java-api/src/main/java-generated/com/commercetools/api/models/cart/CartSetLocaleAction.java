
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetLocaleAction cartSetLocaleAction = CartSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetLocaleActionImpl.class)
public interface CartSetLocaleAction extends CartUpdateAction {

    String SET_LOCALE = "setLocale";

    /**
     *  <p>Value to set. Must be one of the Project's <code>languages</code>. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static CartSetLocaleAction of() {
        return new CartSetLocaleActionImpl();
    }

    public static CartSetLocaleAction of(final CartSetLocaleAction template) {
        CartSetLocaleActionImpl instance = new CartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static CartSetLocaleActionBuilder builder() {
        return CartSetLocaleActionBuilder.of();
    }

    public static CartSetLocaleActionBuilder builder(final CartSetLocaleAction template) {
        return CartSetLocaleActionBuilder.of(template);
    }

    default <T> T withCartSetLocaleAction(Function<CartSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetLocaleAction>";
            }
        };
    }
}
