package wtt.plugin.task.mm;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

import io.kestra.core.models.annotations.PluginProperty;
import io.kestra.core.models.tasks.RunnableTask;
import io.kestra.core.models.tasks.Task;
import io.kestra.core.runners.RunContext;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@ToString
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@Schema(
    title = "Reverse a string",
    description = "Reverse all letters from a string"
)
public class ReverseString extends Task implements RunnableTask<ReverseString.Output> {
    @Schema(
        title = "The base string you want to reverse"
    )
    @PluginProperty(dynamic = true)
    private String format;

    @Override
    public ReverseString.Output run(RunContext runContext) throws Exception {
        Logger logger = runContext.logger();

        String render = runContext.render(format);
        logger.debug(render);

        return Output.builder()
            .reverse(StringUtils.reverse(render))
            .build();
    }

    @Builder
    @Getter
    public static class Output implements io.kestra.core.models.tasks.Output {
        @Schema(
            title = "The reverse string "
        )
        private final String reverse;
    }
}