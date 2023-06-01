package com.commercetools.history.models.common;


import com.commercetools.history.models.common.SuggestTokenizer;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SuggestTokenizerBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SuggestTokenizer suggestTokenizer = SuggestTokenizer.builder()
 *             .type("{type}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SuggestTokenizerBuilder implements Builder<SuggestTokenizer> {

    
    
    private String type;

    
    /**
     * set the value to the type
     * @param type value to be set
     * @return Builder
     */
    
    public SuggestTokenizerBuilder type( final String type) {
        this.type = type;
        return this;
    }
    
    

    /**
     * value of type}
     * @return type
     */
    
    
    public String getType(){
        return this.type;
    }

    /**
     * builds SuggestTokenizer with checking for non-null required values
     * @return SuggestTokenizer
     */
    public SuggestTokenizer build() {
        Objects.requireNonNull(type, SuggestTokenizer.class + ": type is missing");
        return new SuggestTokenizerImpl(type);
    }
    
    /**
     * builds SuggestTokenizer without checking for non-null required values
     * @return SuggestTokenizer
     */
    public SuggestTokenizer buildUnchecked() {
        return new SuggestTokenizerImpl(type);
    }

    /**
     * factory method for an instance of SuggestTokenizerBuilder
     * @return builder 
     */
    public static SuggestTokenizerBuilder of() {
        return new SuggestTokenizerBuilder();
    }

    /**
     * create builder for SuggestTokenizer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SuggestTokenizerBuilder of(final SuggestTokenizer template) {
        SuggestTokenizerBuilder builder = new SuggestTokenizerBuilder();
        builder.type = template.getType();
        return builder;
    }

}
