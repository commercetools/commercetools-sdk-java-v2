
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.commercetools.api.models.common.ResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Category">Category</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryResourceIdentifierImpl.class)
public interface CategoryResourceIdentifier
        extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Category> {

    String CATEGORY = "category";

    /**
    *  <p>Platform-generated unique identifier of the referenced <a href="ctp:api:type:Channel">Category</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("id")
    public String getId();

    /**
    *  <p>User-defined unique identifier of the referenced <a href="ctp:api:type:Category">Category</a>. Either <code>id</code> or <code>key</code> is required.</p>
    */

    @JsonProperty("key")
    public String getKey();

    public void setId(final String id);

    public void setKey(final String key);

    public static CategoryResourceIdentifier of() {
        return new CategoryResourceIdentifierImpl();
    }

    public static CategoryResourceIdentifier of(final CategoryResourceIdentifier template) {
        CategoryResourceIdentifierImpl instance = new CategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    public static CategoryResourceIdentifierBuilder builder() {
        return CategoryResourceIdentifierBuilder.of();
    }

    public static CategoryResourceIdentifierBuilder builder(final CategoryResourceIdentifier template) {
        return CategoryResourceIdentifierBuilder.of(template);
    }

    default <T> T withCategoryResourceIdentifier(Function<CategoryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryResourceIdentifier>";
            }
        };
    }
}
