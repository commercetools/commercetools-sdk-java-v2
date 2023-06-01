package com.commercetools.api.models.graph_ql;


import com.commercetools.api.models.graph_ql.GraphQLErrorLocation;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLErrorLocationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLErrorLocation graphQLErrorLocation = GraphQLErrorLocation.builder()
 *             .line(1)
 *             .column(1)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class GraphQLErrorLocationBuilder implements Builder<GraphQLErrorLocation> {

    
    
    private Integer line;
    
    
    
    private Integer column;

    
    /**
     * set the value to the line
     * @param line value to be set
     * @return Builder
     */
    
    public GraphQLErrorLocationBuilder line( final Integer line) {
        this.line = line;
        return this;
    }
    
    
    
    
    /**
     * set the value to the column
     * @param column value to be set
     * @return Builder
     */
    
    public GraphQLErrorLocationBuilder column( final Integer column) {
        this.column = column;
        return this;
    }
    
    

    /**
     * value of line}
     * @return line
     */
    
    
    public Integer getLine(){
        return this.line;
    }
    
    /**
     * value of column}
     * @return column
     */
    
    
    public Integer getColumn(){
        return this.column;
    }

    /**
     * builds GraphQLErrorLocation with checking for non-null required values
     * @return GraphQLErrorLocation
     */
    public GraphQLErrorLocation build() {
        Objects.requireNonNull(line, GraphQLErrorLocation.class + ": line is missing");
        Objects.requireNonNull(column, GraphQLErrorLocation.class + ": column is missing");
        return new GraphQLErrorLocationImpl(line, column);
    }
    
    /**
     * builds GraphQLErrorLocation without checking for non-null required values
     * @return GraphQLErrorLocation
     */
    public GraphQLErrorLocation buildUnchecked() {
        return new GraphQLErrorLocationImpl(line, column);
    }

    /**
     * factory method for an instance of GraphQLErrorLocationBuilder
     * @return builder 
     */
    public static GraphQLErrorLocationBuilder of() {
        return new GraphQLErrorLocationBuilder();
    }

    /**
     * create builder for GraphQLErrorLocation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLErrorLocationBuilder of(final GraphQLErrorLocation template) {
        GraphQLErrorLocationBuilder builder = new GraphQLErrorLocationBuilder();
        builder.line = template.getLine();
        builder.column = template.getColumn();
        return builder;
    }

}
