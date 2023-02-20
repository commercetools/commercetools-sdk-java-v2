
package com.commercetools.api.models.attribute_group;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeGroupSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeGroupSetKeyAction attributeGroupSetKeyAction = AttributeGroupSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AttributeGroupSetKeyActionImpl.class)
public interface AttributeGroupSetKeyAction extends AttributeGroupUpdateAction {

    String SET_KEY = "setKey";

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     */

    @JsonProperty("key")
    public String getKey();

    public void setKey(final String key);

    public static AttributeGroupSetKeyAction of() {
        return new AttributeGroupSetKeyActionImpl();
    }

    public static AttributeGroupSetKeyAction of(final AttributeGroupSetKeyAction template) {
        AttributeGroupSetKeyActionImpl instance = new AttributeGroupSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public static AttributeGroupSetKeyActionBuilder builder() {
        return AttributeGroupSetKeyActionBuilder.of();
    }

    public static AttributeGroupSetKeyActionBuilder builder(final AttributeGroupSetKeyAction template) {
        return AttributeGroupSetKeyActionBuilder.of(template);
    }

    default <T> T withAttributeGroupSetKeyAction(Function<AttributeGroupSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static AttributeGroupSetKeyAction ofUnset() {
        return new AttributeGroupSetKeyActionImpl(null);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AttributeGroupSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<AttributeGroupSetKeyAction>";
            }
        };
    }
}
