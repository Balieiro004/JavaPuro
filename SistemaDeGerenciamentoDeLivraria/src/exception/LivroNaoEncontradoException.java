package exception;

import java.util.concurrent.ExecutionException;

public class LivroNaoEncontradoException extends ExecutionException {
    public LivroNaoEncontradoException(String message) {
        super(message);
    }
}
