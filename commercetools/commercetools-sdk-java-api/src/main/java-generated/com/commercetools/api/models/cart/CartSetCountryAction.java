
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCountryAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCountryAction cartSetCountryAction = CartSetCountryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCountryActionImpl.class)
public interface CartSetCountryAction extends CartUpdateAction {

    String SET_COUNTRY = "setCountry";

    /**
     <*  <p>Two-digit country code as per ISO 3166-1 alpha-2.</p>>
     */

    @JsonProperty("country")
    public String getCountry();

    public void setCountry(final String country);

    public static CartSetCountryAction of() {
        return new CartSetCountryActionImpl();
    }

    public static CartSetCountryAction of(final CartSetCountryAction template) {
        CartSetCountryActionImpl instance = new CartSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public static CartSetCountryActionBuilder builder() {
        return CartSetCountryActionBuilder.of();
    }

    public static CartSetCountryActionBuilder builder(final CartSetCountryAction template) {
        return CartSetCountryActionBuilder.of(template);
    }

    default <T> T withCartSetCountryAction(Function<CartSetCountryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCountryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCountryAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCountryAction>";
            }
        };
    }
}
