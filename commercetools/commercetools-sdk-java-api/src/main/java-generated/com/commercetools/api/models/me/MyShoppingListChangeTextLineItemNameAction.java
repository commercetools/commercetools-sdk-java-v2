
package com.commercetools.api.models.me;

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
 * MyShoppingListChangeTextLineItemNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyShoppingListChangeTextLineItemNameAction myShoppingListChangeTextLineItemNameAction = MyShoppingListChangeTextLineItemNameAction.builder()
 *             .textLineItemId("{textLineItemId}")
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyShoppingListChangeTextLineItemNameActionImpl.class)
public interface MyShoppingListChangeTextLineItemNameAction extends MyShoppingListUpdateAction {

    String CHANGE_TEXT_LINE_ITEM_NAME = "changeTextLineItemName";

    /**
     *
     */
    @NotNull
    @JsonProperty("textLineItemId")
    public String getTextLineItemId();

    /**
     *  <p>JSON object where the keys are of type Locale, and the values are the strings used for the corresponding language.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setTextLineItemId(final String textLineItemId);

    public void setName(final LocalizedString name);

    public static MyShoppingListChangeTextLineItemNameAction of() {
        return new MyShoppingListChangeTextLineItemNameActionImpl();
    }

    public static MyShoppingListChangeTextLineItemNameAction of(
            final MyShoppingListChangeTextLineItemNameAction template) {
        MyShoppingListChangeTextLineItemNameActionImpl instance = new MyShoppingListChangeTextLineItemNameActionImpl();
        instance.setTextLineItemId(template.getTextLineItemId());
        instance.setName(template.getName());
        return instance;
    }

    public static MyShoppingListChangeTextLineItemNameActionBuilder builder() {
        return MyShoppingListChangeTextLineItemNameActionBuilder.of();
    }

    public static MyShoppingListChangeTextLineItemNameActionBuilder builder(
            final MyShoppingListChangeTextLineItemNameAction template) {
        return MyShoppingListChangeTextLineItemNameActionBuilder.of(template);
    }

    default <T> T withMyShoppingListChangeTextLineItemNameAction(
            Function<MyShoppingListChangeTextLineItemNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyShoppingListChangeTextLineItemNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<MyShoppingListChangeTextLineItemNameAction>";
            }
        };
    }
}
