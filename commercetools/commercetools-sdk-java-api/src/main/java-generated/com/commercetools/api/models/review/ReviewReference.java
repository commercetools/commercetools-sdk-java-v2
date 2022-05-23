
package com.commercetools.api.models.review;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 <p>Reference to a Review.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ReviewReference reviewReference = ReviewReference.builder()
           .id("{id}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ReviewReferenceImpl.class)
public interface ReviewReference extends Reference, com.commercetools.api.models.Identifiable<Review> {

    String REVIEW = "review";

    /**
     *  <p>Contains the representation of the expanded Review. Only present in responses to requests with Reference Expansion for Reviews.</p>
     */
    @Valid
    @JsonProperty("obj")
    public Review getObj();

    /**
     *  <p>Platform-generated unique identifier of the referenced Review.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    public void setObj(final Review obj);

    public void setId(final String id);

    public static ReviewReference of() {
        return new ReviewReferenceImpl();
    }

    public static ReviewReference of(final ReviewReference template) {
        ReviewReferenceImpl instance = new ReviewReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ReviewReferenceBuilder builder() {
        return ReviewReferenceBuilder.of();
    }

    public static ReviewReferenceBuilder builder(final ReviewReference template) {
        return ReviewReferenceBuilder.of(template);
    }

    default <T> T withReviewReference(Function<ReviewReference, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ReviewReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ReviewReference>() {
            @Override
            public String toString() {
                return "TypeReference<ReviewReference>";
            }
        };
    }
}
