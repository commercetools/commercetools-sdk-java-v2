package com.commercetools.history.models.common;

import com.commercetools.history.models.common.SuggestTokenizer;
import com.commercetools.history.models.common.SearchKeyword;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SearchKeywordBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SearchKeyword searchKeyword = SearchKeyword.builder()
 *             .text("{text}")
 *             .suggestTokenizer(suggestTokenizerBuilder -> suggestTokenizerBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SearchKeywordBuilder implements Builder<SearchKeyword> {

    
    
    private String text;
    
    
    
    private com.commercetools.history.models.common.SuggestTokenizer suggestTokenizer;

    
    /**
     * set the value to the text
     * @param text value to be set
     * @return Builder
     */
    
    public SearchKeywordBuilder text( final String text) {
        this.text = text;
        return this;
    }
    
    
    
    
    /**
     * set the value to the suggestTokenizer using the builder function
     * @param builder function to build the suggestTokenizer value
     * @return Builder
     */
    
    public SearchKeywordBuilder suggestTokenizer(Function<com.commercetools.history.models.common.SuggestTokenizerBuilder, com.commercetools.history.models.common.SuggestTokenizerBuilder> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.history.models.common.SuggestTokenizerBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the suggestTokenizer using the builder function
     * @param builder function to build the suggestTokenizer value
     * @return Builder
     */
    
    public SearchKeywordBuilder withSuggestTokenizer(Function<com.commercetools.history.models.common.SuggestTokenizerBuilder, com.commercetools.history.models.common.SuggestTokenizer> builder) {
        this.suggestTokenizer = builder.apply(com.commercetools.history.models.common.SuggestTokenizerBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the suggestTokenizer
     * @param suggestTokenizer value to be set
     * @return Builder
     */
    
    public SearchKeywordBuilder suggestTokenizer( final com.commercetools.history.models.common.SuggestTokenizer suggestTokenizer) {
        this.suggestTokenizer = suggestTokenizer;
        return this;
    }
    
    

    /**
     * value of text}
     * @return text
     */
    
    
    public String getText(){
        return this.text;
    }
    
    /**
     * value of suggestTokenizer}
     * @return suggestTokenizer
     */
    
    
    public com.commercetools.history.models.common.SuggestTokenizer getSuggestTokenizer(){
        return this.suggestTokenizer;
    }

    /**
     * builds SearchKeyword with checking for non-null required values
     * @return SearchKeyword
     */
    public SearchKeyword build() {
        Objects.requireNonNull(text, SearchKeyword.class + ": text is missing");
        Objects.requireNonNull(suggestTokenizer, SearchKeyword.class + ": suggestTokenizer is missing");
        return new SearchKeywordImpl(text, suggestTokenizer);
    }
    
    /**
     * builds SearchKeyword without checking for non-null required values
     * @return SearchKeyword
     */
    public SearchKeyword buildUnchecked() {
        return new SearchKeywordImpl(text, suggestTokenizer);
    }

    /**
     * factory method for an instance of SearchKeywordBuilder
     * @return builder 
     */
    public static SearchKeywordBuilder of() {
        return new SearchKeywordBuilder();
    }

    /**
     * create builder for SearchKeyword instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SearchKeywordBuilder of(final SearchKeyword template) {
        SearchKeywordBuilder builder = new SearchKeywordBuilder();
        builder.text = template.getText();
        builder.suggestTokenizer = template.getSuggestTokenizer();
        return builder;
    }

}
