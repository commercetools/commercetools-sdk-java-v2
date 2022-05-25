
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetLocaleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetLocaleAction myCartSetLocaleAction = MyCartSetLocaleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCartSetLocaleActionImpl.class)
public interface MyCartSetLocaleAction extends MyCartUpdateAction {

    String SET_LOCALE = "setLocale";

    /**
     *
     */

    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static MyCartSetLocaleAction of() {
        return new MyCartSetLocaleActionImpl();
    }

    public static MyCartSetLocaleAction of(final MyCartSetLocaleAction template) {
        MyCartSetLocaleActionImpl instance = new MyCartSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    public static MyCartSetLocaleActionBuilder builder() {
        return MyCartSetLocaleActionBuilder.of();
    }

    public static MyCartSetLocaleActionBuilder builder(final MyCartSetLocaleAction template) {
        return MyCartSetLocaleActionBuilder.of(template);
    }

    default <T> T withMyCartSetLocaleAction(Function<MyCartSetLocaleAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCartSetLocaleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCartSetLocaleAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyCartSetLocaleAction>";
            }
        };
    }
}
