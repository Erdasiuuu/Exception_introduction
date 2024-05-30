import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * @brief Класс Resource для демонстрации подавления исключений
 *
 */
class Resource implements AutoCloseable {
  private static final Logger LOGGER = Logger.getLogger(Resource.class.getName());

  public Resource() {
    LOGGER.info("Resource created");
  }

  public void useResource() throws Exception {
    throw new Exception("Exception");
  }

  @Override
  public void close() throws Exception {
    throw new Exception("Exception");
  }
}
