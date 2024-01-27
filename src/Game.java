class Game {
    private String name;
    private boolean started;
    private boolean finished;
    private int score;

    public Game(String name) {
        this.name = name;
        this.started = false;
        this.finished = false;
        this.score = 0;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", started=" + started +
                ", finished=" + finished +
                ", score=" + score +
                '}';
    }
}