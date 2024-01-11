package Board.anonymousBoard.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class ContentAnswerDto {
    private String username;
    private String title;
    private String contents;
    private LocalDateTime createdAt;

    public FeedResponseDto(Feed feed) {
        this.username = feed.getUser().getUsername();
        this.title = feed.getTitle();
        this.contents = feed.getContents();
        this.createdAt = feed.getCreatedAt();
    }
}
