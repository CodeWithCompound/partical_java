class Particle {
    double x, y;
    double dx, dy;
    int lifetime;

    Particle(double x, double y, double dx, double dy, int lifetime) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
        this.lifetime = lifetime;
    }

    void update(int width, int height) {
        x += dx;
        y += dy;

        if (x < 0 || x > width - 10) dx = -dx;
        if (y < 0 || y > height - 10) dy = -dy;

        lifetime--;
    }

    boolean isAlive() {
        return lifetime > 0;
    }
}
