
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   CategoryOrderHints categoryOrderHints = CategoryOrderHints.builder()
           ./^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$/("{/^[a-fA-F0-9]{8}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{4}-[a-fA-F0-9]{12}$/}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryOrderHintsImpl.class)
public interface CategoryOrderHints {

    @NotNull
    @JsonAnyGetter
    public Map<String, String> values();

    @JsonAnySetter
    public void setValue(String key, String value);

    public static CategoryOrderHints of() {
        return new CategoryOrderHintsImpl();
    }

    public static CategoryOrderHints of(final CategoryOrderHints template) {
        CategoryOrderHintsImpl instance = new CategoryOrderHintsImpl();
        return instance;
    }

    public static CategoryOrderHintsBuilder builder() {
        return CategoryOrderHintsBuilder.of();
    }

    public static CategoryOrderHintsBuilder builder(final CategoryOrderHints template) {
        return CategoryOrderHintsBuilder.of(template);
    }

    default <T> T withCategoryOrderHints(Function<CategoryOrderHints, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryOrderHints> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryOrderHints>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryOrderHints>";
            }
        };
    }
}
