
package com.commercetools.api.models.me;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyShoppingListSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListSetDescriptionAction myShoppingListSetDescriptionAction = MyShoppingListSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListSetDescriptionActionImpl.class)
public interface MyShoppingListSetDescriptionAction extends MyShoppingListUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setDescription(final LocalizedString description);

    public static MyShoppingListSetDescriptionAction of() {
        return new MyShoppingListSetDescriptionActionImpl();
    }

    public static MyShoppingListSetDescriptionAction of(final MyShoppingListSetDescriptionAction template) {
        MyShoppingListSetDescriptionActionImpl instance = new MyShoppingListSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static MyShoppingListSetDescriptionActionBuilder builder() {
        return MyShoppingListSetDescriptionActionBuilder.of();
    }

    public static MyShoppingListSetDescriptionActionBuilder builder(final MyShoppingListSetDescriptionAction template) {
        return MyShoppingListSetDescriptionActionBuilder.of(template);
    }

    default <T> T withMyShoppingListSetDescriptionAction(Function<MyShoppingListSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListSetDescriptionAction>";
            }
        };
    }
}
