package response;

import java.io.PrintWriter;

public class ResponseImpl implements Response {

    private PrintWriter writer;

    public ResponseImpl(PrintWriter writer) {
        this.writer = writer;
    }

    @Override
    public PrintWriter getWriter() {
        return writer;
    }

}
